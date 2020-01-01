/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.bluetooth.bluegiga.internal.command.attributedb;

import org.openhab.binding.bluetooth.bluegiga.internal.BlueGigaResponse;

/**
 * Class to implement the BlueGiga command <b>userReadRequestEvent</b>.
 * <p>
 * This event is generated when a remote device tries to read an attribute which has the user
 * property enabled. This event should be responded within 30 seconds with User Read Response
 * command either containing the data or an error code.
 * <p>
 * This class provides methods for processing BlueGiga API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class BlueGigaUserReadRequestEvent extends BlueGigaResponse {
    public static int COMMAND_CLASS = 0x02;
    public static int COMMAND_METHOD = 0x01;

    /**
     * Connection ID which requested attribute
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int connection;

    /**
     * Attribute handle requested
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int handle;

    /**
     * Attribute offset to send data from
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     */
    private int offset;

    /**
     * Maximum data size to respond with. If more data is sent than indicated by this parameter, the
     * extra bytes will be ignored.
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     */
    private int maxsize;

    /**
     * Event constructor
     */
    public BlueGigaUserReadRequestEvent(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        event = (inputBuffer[0] & 0x80) != 0;

        // Deserialize the fields
        connection = deserializeUInt8();
        handle = deserializeUInt16();
        offset = deserializeUInt16();
        maxsize = deserializeUInt8();
    }

    /**
     * Connection ID which requested attribute
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current connection as {@link int}
     */
    public int getConnection() {
        return connection;
    }
    /**
     * Attribute handle requested
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     *
     * @return the current handle as {@link int}
     */
    public int getHandle() {
        return handle;
    }
    /**
     * Attribute offset to send data from
     * <p>
     * BlueGiga API type is <i>uint16</i> - Java type is {@link int}
     *
     * @return the current offset as {@link int}
     */
    public int getOffset() {
        return offset;
    }
    /**
     * Maximum data size to respond with. If more data is sent than indicated by this parameter, the
     * extra bytes will be ignored.
     * <p>
     * BlueGiga API type is <i>uint8</i> - Java type is {@link int}
     *
     * @return the current maxsize as {@link int}
     */
    public int getMaxsize() {
        return maxsize;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("BlueGigaUserReadRequestEvent [connection=");
        builder.append(connection);
        builder.append(", handle=");
        builder.append(handle);
        builder.append(", offset=");
        builder.append(offset);
        builder.append(", maxsize=");
        builder.append(maxsize);
        builder.append(']');
        return builder.toString();
    }
}
