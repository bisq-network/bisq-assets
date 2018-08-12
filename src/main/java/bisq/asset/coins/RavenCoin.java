package bisq.asset.coins;

import bisq.asset.Base58BitcoinAddressValidator;
import bisq.asset.Coin;
import bisq.asset.NetworkParametersAdapter;

public class RavenCoin extends Coin {

    public RavenCoin() {
        super("RavenCoin", "RVN", new Base58BitcoinAddressValidator(new RavenCoinParams()));
    }

    private static class RavenCoinParams extends NetworkParametersAdapter {

        public RavenCoinParams() {

            this.interval = INTERVAL;
            this.targetTimespan = TARGET_TIMESPAN;
            this.dumpedPrivateKeyHeader = 0x80;

            //Similar to BTC address format but with different header
            this.addressHeader = 60;
            this.p2shHeader = 23;
            this.acceptableAddressCodes = new int[]{this.addressHeader, this.p2shHeader};

            this.port = 8767;
            this.bip32HeaderPub = 0x0488B21E;
            this.bip32HeaderPriv = 0x0488ADE4;
            this.packetMagic = 0x5241564EL;
            this.dnsSeeds = new String[]{"seed-raven.ravencoin.org", "seed-raven.bitactivate.com"};
        }
    }
}
