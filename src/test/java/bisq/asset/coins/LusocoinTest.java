/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class LusocoinTest extends AbstractAssetTest {

    public LusocoinTest() {
        super(new Lusocoin());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("LPj7LodAYKxmd4wDsABYLxpJnDSdGpdmKv");
        assertValidAddress("LSp2imeidEUGX6MjxNR5re6A9AiGeoezGi");
        assertValidAddress("Li1Ny8RiTy1eZdeYfPnUPtEyts4nU3N2UP");
        assertValidAddress("LiWjwY7PdnFJBS4h3cMLwd2Qon54Ta6gx3");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("1Qv8TxZvTUbN9d1KmDNrTku91Y5qhqbyfL");
        assertInvalidAddress("bMQv8TxZvTUbN9d1KmDNrTku91Y5qhqbyfL");
        assertInvalidAddress("ms142HdWDfDQXYBpuyMvsU3KHwryLxnCr");
        assertInvalidAddress("3ASDA8s142HdWDfDQXYBuyMvsU3KHwryLxnCr");
        assertInvalidAddress("1ddhisads");
        assertInvalidAddress("Mu9hdahudadad");
    }
}

