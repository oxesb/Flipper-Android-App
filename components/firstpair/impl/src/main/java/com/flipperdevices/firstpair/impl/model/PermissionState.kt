package com.flipperdevices.firstpair.impl.model

enum class PermissionState {
    NOT_REQUESTED_YET,
    TURN_ON_BLUETOOTH,
    TURN_ON_LOCATION,
    BLUETOOTH_PERMISSION,
    BLUETOOTH_PERMISSION_GO_TO_SETTINGS,
    LOCATION_PERMISSION,
    LOCATION_PERMISSION_GO_TO_SETTINGS,
    ALL_GRANTED
}
