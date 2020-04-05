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
package org.openhab.binding.evohome.internal.api.models.v2.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Response model for the temperature control system
 *
 * @author Jasper van Zuijlen - Initial contribution
 *
 */
public class TemperatureControlSystem {

    @SerializedName("systemId")
    private String systemId;

    @SerializedName("modelType")
    private String modelType;

    @SerializedName("zones")
    private List<Zone> zones;

    @SerializedName("allowedSystemModes")
    private List<Mode> allowedSystemModes;

    public String getSystemId() {
        return systemId;
    }

    public List<Zone> getZones() {
        return zones;
    }

}