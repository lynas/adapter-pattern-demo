package com.reev.adapterpattern

data class Ocpp20(
    val o20MachineId: String="",
    val o20EvseId: String="",
    val consumptionInformation: String?=null
) {
    fun statusIdentifier() : String {
        return "status"
    }

    fun currentValue() : String {
        return "current value"
    }

    fun machineOperator() : String {
        return "start/stop"
    }

    fun auth() : String {
        return "authorize"
    }
}

class Ocpp20ReevBackendADAPTER(
    val ocpp20: Ocpp20
) : ReevBackend{
    override fun authorize(dto: ReevJsonDto) {
        println(ocpp20.auth())
    }

    override fun startTransaction(dto: ReevJsonDto) {
        println(ocpp20.machineOperator())
    }

    override fun stopTransaction(dto: ReevJsonDto) {
        println(ocpp20.machineOperator())
    }

    override fun changeConnectorStatus(dto: ReevJsonDto) {
        println(ocpp20.statusIdentifier())
    }

    override fun sendMeterValue(dto: ReevJsonDto) {
        println(ocpp20.currentValue())
    }

}