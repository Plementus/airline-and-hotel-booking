# TravelFix — Airline & Hotel Booking Platform — Plemo Repo Guide

> A Play Framework 2.4 (Java + Scala, SBT-built) online travel agency: B2C flight/hotel booking, a B2B "Swift" travel-agent portal, and an admin/CMS console, wired to Sabre & Amadeus GDS for flights, RoomBookPro for hotels, and Nigerian payment gateways.

## Overview

This is the monolithic web application for **TravelFix Limited** (`project.company.name`), a Nigeria-based ("Lagos/Africa" timezone, Naira/USD currencies, Wuse II Abuja address) online travel agency branded **TravelFix** with the slogan "Everything is easy". The system lets retail customers search and book flights and hotels, provides a separate **B2B agent portal** ("Swift") for affiliate/sub-agents with their own markups and reporting, and ships a full back-office **console** (URL prefix `/tfx`) covering system master data, financials, flight markup/incentive rules, support tickets, a file/data bank, and a built-in **CMS** (pages, containers, templates, widgets, announcements, banners). It is a classic Play 2.4 server-rendered app (Twirl `.scala.html` views) backed by Ebean ORM over MySQL. The SBT project name is `TravelFix`; `version := "1.0.1"`.

## Tech Stack

- **Framework:** Play Framework **2.4.3** (`PlayJava` + `PlayEbean` SBT plugins), server-side rendered (Twirl templates).
- **Languages:** Java (primary — controllers, models, services) with some Scala (`2.11.6`) for SOAP/XML utilities and a few controllers/views.
- **Build:** SBT `0.13.8` (Typesafe Activator scaffolding — `activator` / `activator.bat`). Targets Java 8 (`system.properties: java.runtime.version=1.8`).
- **ORM / DB:** Ebean (`sbt-play-ebean`); models live under `models.*`. Production DB is **MySQL** on AWS RDS (`conf/production.conf`, `com.mysql.jdbc.Driver`); a PostgreSQL JDBC driver is also on the classpath. No SQL evolutions are checked in.
- **Auth:** Custom session/ACL layer (`core.security.*`) plus JWT (`authentikat-jwt`), bcrypt (`jbcrypt`), and social login (Facebook via `restfb`, Google Plus).
- **Integrations / libraries:** Sabre & Amadeus GDS (large generated SOAP/JAXB stubs), RoomBookPro hotel API, `play-mailer` (SMTP), AWS S3 (`aws-java-sdk-s3`), Dropbox SDK, iText PDF (`com.lowagie:itext`), Apache Commons CSV/IO, Gson, JDOM.
- **Frontend assets:** SBT web pipeline (LESS, CoffeeScript, RequireJS, JSHint, digest) over a large `public/assets/vendor/*` (Bootstrap, AngularJS datatables, CodeMirror, file-uploader, etc.).
- **Infra:** Deployed against AWS (RDS MySQL, S3 bucket `tfxs3` in `us-west-2`). GZip filter enabled; CSRF/CORS/security-headers modules present but commented out.

## Repository Structure

- `app/controllers/` — Play controllers (41 files). Public site at root, `console/` (admin `/tfx`, incl. `console/cms/`), `swift/` (B2B `/b2b`), `api/`, plus `abstracts/` base controllers and `interceptors/` security filters.
- `app/models/` — Ebean entities (~100 `.java`): flights, hotels, bookings, users, payments, CMS, support, markup rules, etc.
- `app/core/` — Cross-cutting infrastructure: `Bootstraps` (the Play `application.global`), `security/` (Auth, ACL, session storage, `Filters`), payments, carts, mailer, SMS, pagination, audit, caching, utilities.
- `app/services/` — Third-party integration code (~2056 files, mostly generated): `amadeus/` and `sabre/` GDS SOAP/JAXB stubs, `roombookpro/` hotel API client + DTOs, `globalpay/` payment SOAP client, `utils/` SOAP/XML helpers.
- `app/views/` — Twirl templates (`console/`, `swift/`, `auth/`, `flights/`, `hotel/`, `guests/`, `emails/`, `layouts/`, `errors/`, `_payment_methods/`, helpers).
- `conf/` — `routes`, `application.conf`, and per-integration config includes (`amadeus.conf`, `sabre.conf`, `roombookpro.conf`, `GTPay.conf`, `GlobalPay.conf`, `Remita.conf`, `mail.conf`, `project_detail.conf`, `production.conf`, `ebean.properties`, `navigation.xml`).
- `project/` — SBT build (`plugins.sbt`, `build.properties`).
- `public/` — Static assets and large vendored JS/CSS libraries under `assets/vendor/`.
- Root: `build.sbt`, `system.properties`, `activator` / `activator.bat`, `LICENSE`, `README.md`, `contributors.txt`.

## Key Files & Entry Points

- `build.sbt` — SBT module definition, Play/Ebean plugins, all library dependencies and versions.
- `conf/application.conf` — Master config. Selects the active GDS (`active.gds = "sabre"`), wires the Global object (`core.Bootstraps`), session-based auth (`auth.driver = "session"`, cookie `travelfix-session`), CSRF filter (`core.security.Filters`), timezone, and `include`s every integration `.conf`. **Includes `development.conf` by default — that file is not in the repo (provide it locally with the `db.default.*` block).**
- `conf/routes` — Single source of truth for all URLs. Three surfaces: public (`/`, `/flight/*`, `/hotel/*`, `/login`, `/register`, payment-gateway callbacks), B2B (`/b2b/*` → `controllers.swift.*`), and admin console (`/tfx/*` → `controllers.console.*`, incl. `/tfx/cms/*`).
- `app/core/Bootstraps.java` — Play `GlobalSettings` / application lifecycle bootstrap (set as `application.global`).
- `app/core/security/Filters.java` + `app/controllers/interceptors/*` — request filtering and the Console/Customer/Swift security interceptors that gate each surface.
- `app/controllers/FlightController.java` / `HotelController.java` — public search → result → booking → complete-booking flows.
- `app/controllers/PaymentControllers.java` + `app/core/Payments.java` — payment-gateway transaction handling (GTPay/GlobalPay/Remita) and transaction-reference generation; gateway callbacks land at `/payment-gateway/transactionresponse/:gatewayName`.
- `app/services/roombookpro/client/RoomBookProClient.java` — hotel supplier API client (search/details/book/cancel; request/response DTOs alongside it).
- `app/services/amadeus/` & `app/services/sabre/` — GDS request builders and (largely auto-generated) SOAP/JAXB model stubs; the active one is chosen by `active.gds`.

## Working in This Repo

- **Build/run:** standard Play 2.4 / Activator workflow — `./activator run` (dev) or `./activator dist` / `stage` (package). SBT `0.13.8`, Java **8** required (newer JDKs will not compile this Play/Scala 2.11 stack).
- **Local DB config is required and missing from git:** `application.conf` includes `development.conf`, which is not committed. Create it with a `db.default.{driver,url,user,pass}` block (mirror `conf/production.conf`, which targets MySQL) plus `ebean.default = ["models.*"]` before the app will boot.
- **Switching GDS / payment providers** is config-driven: change `active.gds` in `application.conf`; gateway behavior is driven by `GTPay.conf` / `GlobalPay.conf` / `Remita.conf`.
- **Conventions / gotchas:**
  - Three distinct authenticated surfaces share the codebase — **public customer**, **B2B "Swift" agent** (`/b2b`, `controllers.swift.*`), and **admin console** (`/tfx`, `controllers.console.*`). Match the surface's existing controller package, interceptor, and `Secured*Controller` base class when adding routes; don't cross them.
  - Domain vocabulary to reuse: `FlightBookings` / `HotelBookings`, `FlightMarkUpDownRules` + `FlightMarkupPriceDirection` + `AirlineIncentives` (B2C pricing rules), `B2bUsers` / `B2bSubUsers` / `B2bMarkups` (agent side), `GdsNames` / `GdsFareOptions`, `Cms*` (CMS), `SupportTickets` / `SupportMessages`.
  - Routes mix `GET` and `POST` on the same path for some endpoints (e.g. flight-result JSON, payment responses) — intentional for gateway/AJAX callbacks; the `# NOCSRF` comment marks routes excluded from the CSRF filter.
  - The `services/` tree is ~2000 mostly **generated** SOAP stubs — do not hand-edit or "clean up" the `amadeus/`/`sabre/` JAXB classes; touch the client/builder/util code instead.
  - **Security note:** `conf/application.conf` and `conf/production.conf` contain hardcoded live-looking secrets (AWS access keys, DB password, gateway merchant IDs/hash keys). Treat these as committed credentials that should be rotated and externalized; do not propagate them into new code or logs.
  - `.DS_Store` files are committed throughout — ignore them.

## Repository Notes

- **Default branch:** `main` — it holds the full project (no separate code branch). This `PLEMO.md` documents `main`.
- This is **not** an Odoo/Plemo-SaaS repo and is unrelated to the `plementus16` / `plemo-api` / `plemo-web` stack; it is a standalone Play Framework Java/Scala application under the `Plementus` GitHub org. The `PG-*` Plemo guards in the workspace `CLAUDE.md` do not apply here.
