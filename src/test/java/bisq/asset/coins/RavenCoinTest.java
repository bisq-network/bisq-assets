package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class RavenCoinTest extends AbstractAssetTest {

    public RavenCoinTest() {
        super(new RavenCoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("RWXTRxy1zmzwZCqM3K2VU9Cv81fB1SNfPK");
        assertValidAddress("RVQQXRM4JUFNCEqgtwYUHKMCBrtDA7L7yQ");
        assertValidAddress("RAhn7QDyWLRRLazm5PBhB8iM58tgrKfbs5");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("17VZNX1SN5NtKa8UQFxwQbFeFc3iqRYhemqq");
        assertInvalidAddress("RVQQXdaJUF4343gtwYUHKMCBrtDA7L7yQ");
        assertInvalidAddress("17VZNX1SN5NtKa8UQFxwQbFeFc3iqRYhek#");
        assertInvalidAddress("RVQ23RM4JUFNCEqgtwYUHKMCBrtDA7L7yQ");
    }
}
