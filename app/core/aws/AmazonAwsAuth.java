package core.aws;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;

/**
 * Created by Ibrahim Olanrewaju on 18/03/2016.
 */
public class AmazonAwsAuth {

    private static AmazonAwsAuth ourInstance = new AmazonAwsAuth();

    private AWSCredentials credentials;

    public static AmazonAwsAuth getInstance() {
        return ourInstance;
    }

    private AmazonAwsAuth() {
        try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                            "Please make sure that your credentials file is at the correct " +
                            "location (~/.aws/credentials), and is in valid format.",
                    e);
        }
    }

    public AWSCredentials getCredential() {
        return credentials;
    }
}