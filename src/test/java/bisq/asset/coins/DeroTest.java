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

public class DeroTest extends AbstractAssetTest {

    public DeroTest() {
        super(new Dero());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("dERoaEnz1jm7A5kv9xFxgdAa8Y7SCqepmDFnEo4Rkwe22sVjoBThDweFCmBjkJMLSQKJd4soX6wBierFKbDTh1SL9r8XY829pb");
        assertValidAddress("dERopUMxPjhApMpS4vt2B6MEqTpvQbZo3YTGFr7MoabYC23RE7DvTQCEjju9jXHfwBXJoBfHaCVupDZAAgZpLaY99qhsXcCFmg");
        assertValidAddress("dERoNDzRBZfbLDdeoKD8Zdc7svU36AKPtReksucYRpy4A9oWVcc5dFsdoaxnS7ddmtNvsL5w1eWkYZwvQqApAg8X8XomwZSLws");
        assertValidAddress("dERojPZ7WjBScw9H8PS6oCQcQJBXJaQdNND8ZYbYBr2SSt8wzG8HFg8VgJKcsDonhYLKL5Q71UNWACpNiaESzsJx44HUmJzaWW");
        assertValidAddress("dERopX3LiCoHg3AFLgZB5dJKgvLESnnqLABfvPAM4u869dya9oocJGVU1kG8wQjC25ETPmRyMKw98MxfVwqxbmdY7UEGsR2czw");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("");
        assertInvalidAddress("dERoNDzRBZfbLDdeoKD8Zdc7svU36AKPtReksucYRpy4A9oWVcc5dFsdoaxnS7ddmtNvsL5w1eWkYZwvQqApAg8X8XomwZSLws4k6F");
        assertInvalidAddress("dERoaEnz1jm7A5kv9xFxgdAa8Y7SCqepmDFnEo4Rkwe22sVjoBThDweFCmBjkJMLSQKJd4soX6wBierFKbDTh1SL9r8XY829p");
        assertInvalidAddress("deRopX3LiCoHg3AFLgZB5dJKgvLESnnqLABfvPAM4u869dya9oocJGVU1kG8wQjC25ETPmRyMKw98MxfVwqxbmdY7UEGsR2czw");
        assertInvalidAddress("derojPZ7WjBScw9H8PS6oCQcQJBXJaQdNND8ZYbYBr2SSt8wzG8HFg8VgJKcsDonhYLKL5Q71UNWACpNiaESzsJx44HUmJzaWW");
        assertInvalidAddress("DEROpUMxPjhApMpS4vt2B6MEqTpvQbZo3YTGFr7MoabYC23RE7DvTQCEjju9jXHfwBXJoBfHaCVupDZAAgZpLaY99qhsXcCFmg");
        assertInvalidAddress("dEROjPZ7WjBScw9H8PS6oCQcQJBXJaQdNND8ZYbYBr2SSt8wzG8HFg8VgJKcsDonhYLKL5Q71UNWACpNiaESzsJx44HUmJzaWW");
        assertInvalidAddress("dERojPZ7WjBScw9H8PS6oCQcQJBXJaQdNND8ZYbYBr2SSt8wzG8HFg8VgJKcsDonhYLKL5Q71UNWACpNiaESzsJx44HUmJzaWW#8F8F");
    }
}
