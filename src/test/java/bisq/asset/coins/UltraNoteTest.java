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

public class UltraNoteTest extends AbstractAssetTest {

    public UltraNoteTest() {
        super(new UltraNote());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("Xun3ZzvmNDt9b6okso4PaRBiUtuPL95LDE5X4NLXWhfHWV85NBPo7BYTScBZsUHzzJ3tByYKRpdyf6Cs5sdCfyir2DhCtEyGw9");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("TWQ2cPrRrYecQhsFqopQbiKqpJyzeDtxVWZb8Mytj65k538jxn8JTJ3aNvE7eQsBpYMKPN4pQBLFKALh6cZqL52RSgZWFmD");
        assertInvalidAddress("Z6NHRh8pFh5Y14bhBVAoD4cvqHyoPsQJqB3dr49zoF6bNDFrts96tuujFRoUKWRwpTHmYt4Kf78FES7LCXAXKXFf6bMsx1F");
        assertInvalidAddress("xun3GFRTGCETHurejrfgruyiejbvctfghuihjgvyt§yèuijnbhgy!uiokjn");
        assertInvalidAddress("T6NHRh8pFh5Y14bhBVAoD4cvqHyoPsQJqB3dr49zoF6bNDFrts96tuuj#RoUKWRwpTHmYt4Kf78FES7LCXAXKXFf6bMsx1F");
        assertInvalidAddress("T9Q2cPrRrYecQhsFqopQbiKqpJyzeDtxVWZb8Mytj65k538jxn8JTJ3aNvE7eQsBpYMKPN4pQBLFKALh6cZqL52RSgZWFmDdddddddddddd");
        assertInvalidAddress("T6NHRh8pFh5Y14bhBVAoD4cvqHyoPsQJqB3dr49zoF6bNDFrts96tuujFRoUKWRwpTHmYt4Kf78FES7LCXAXKXFf6bMsx1222222222");
        assertInvalidAddress("T5t9rcTchMDaEn4KyVLEo2adPbWjnRXCgBqVQpujcFU8PvdytNnZAVJHVHW2VEu2ELJEmgMqk1aznXA7i1vr");
        assertInvalidAddress("JDARp92UtmTWDjZatG8sduGTMu89ZasZjEyAwapnANNWCE2hJ4edcszj9hcZHdXr9vJzjHq2TfPrjateDz9Wc8ZJKuDayqJ$%");
        assertInvalidAddress("T3xQ8Gv6w1XE2SQcXBZEmpS5112RAPup7XRr7WkLG8aL98ZBsTAF5q4GdGrWjJTGz4676ymKvU4NzPY8Ca4gfJwL2yhhkJ7");
    }
}
