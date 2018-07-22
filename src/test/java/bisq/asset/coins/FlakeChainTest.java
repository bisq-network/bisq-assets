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

public class FlakeChainTest extends AbstractAssetTest {

    public FlakeChainTest() {
        super(new FlakeChain());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("SFFDroA18JNgUG1neqLkNYQjZiB8u3Bv5ME58X7GmvC7HUdCdMh9E5gadM9qaKiZAMUBAdKn1FdiqbUibygdbxEMTxEYijdixJS9aeY1jwp43");
        assertValidAddress("SFvyyho85nQBd2DaXTJcDEAG8Zn2gxDrxBCrcQhARaMzaNd6D1HnrSDepiEVjzEaHoXghjqWoAgiS7i76oT6Jgff1qW2FqK56");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("XSFvyyho85nQBd2DaXTJcDEAG8Zn2gxDrxBCrcQhARaMzaNd6D1HnrSDepiEVjzEaHoXghjqWoAgiS7i76oT6Jgff1qW2FqK56");
        assertInvalidAddress("XSFFDroA18JNgUG1neqLkNYQjZiB8u3Bv5ME58X7GmvC7HUdCdMh9E5gadM9qaKiZAMUBAdKn1FdiqbUibygdbxEMTxEYijdixJS9aeY1jwp43");
        assertInvalidAddress("");
    }
}
