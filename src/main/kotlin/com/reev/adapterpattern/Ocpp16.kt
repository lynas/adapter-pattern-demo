package com.reev.adapterpattern

data class Ocpp16(
    val o16MachineId: String = "",
    val o16EvseId: String = "",
    val signalSequence: String? = null
) {
    fun statusIdentifier(): String {
        return "status"
    }

    fun machineOperator(): String {
        return "start/stop"
    }

    fun auth(): String {
        return "authorize"
    }

    fun currentValue(): String {
        return "currentValue"
    }
}

class Ocpp16AdapterReevBackendADAPTER(
    val ocpp16: Ocpp16
) : ReevBackend {
    override fun authorize(dto: ReevJsonDto) {
        println("authorize")
    }

    override fun startTransaction(dto: ReevJsonDto) {
        println("startTransaction")
    }

    override fun stopTransaction(dto: ReevJsonDto) {
        println("stopTransaction")
    }

    override fun changeConnectorStatus(dto: ReevJsonDto) {
        println("changeConnectorStatus")
    }

    override fun sendMeterValue(dto: ReevJsonDto) {
        println("sendMeterValue")
    }

}