// $Id$
/*
 * This file is a part of WorldGuard.
 * Copyright (c) sk89q <http://www.sk89q.com>
 * Copyright (c) the WorldGuard team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY), without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldguard.region.attribute;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * An attribute that stores whole numbers (integers) with a range of
 * {@link Integer#MIN_VALUE} to {@link Integer#MAX_VALUE}.
 * 
 * @see Managed another way to store numbers (with more memory cost and null
 *      support)
 */
public class Number extends Attribute {
    
    private int value;

    /**
     * Construct an instance and assign a default name.
     * 
     * @see Attribute#Attribute() for basic mechanics
     */
    public Number() {
    }

    /**
     * Construct an instance and specify an attribute name.
     * 
     * @param name name of the attribute
     */
    public Number(String name) {
        super(name);
    }

    /**
     * Get the value.
     * 
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the value.
     * 
     * @param value the new value
     */
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void read(DataInputStream in, int len) throws IOException {
        value = in.readInt();
    }

    @Override
    public void write(DataOutputStream out) throws IOException {
        out.write(value);
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
