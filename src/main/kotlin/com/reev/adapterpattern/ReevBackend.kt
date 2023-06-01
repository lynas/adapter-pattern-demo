package com.reev.adapterpattern

data class ReevJsonDto(
    val chargePointId: String = "",
    val connectorId: String = "",
    val connectorStatus: String = "",
    val authorizationCode: String = "",
    val meterValue: String? = null
)

interface ReevBackend {
    fun authorize(dto: ReevJsonDto)
    fun startTransaction(dto: ReevJsonDto)
    fun stopTransaction(dto: ReevJsonDto)
    fun changeConnectorStatus(dto: ReevJsonDto)
    fun sendMeterValue(dto: ReevJsonDto)
}

class ReevBackendImpl : ReevBackend {
    override fun authorize(dto: ReevJsonDto) {
        println("CP ${dto.chargePointId}, Connector ${dto.connectorId} is authorized")
    }

    override fun startTransaction(dto: ReevJsonDto) {
        println("CP ${dto.chargePointId}, Connector ${dto.connectorId} startTransaction")
    }

    override fun stopTransaction(dto: ReevJsonDto) {
        println("CP ${dto.chargePointId}, Connector ${dto.connectorId} stopTransaction")
    }

    override fun changeConnectorStatus(dto: ReevJsonDto) {
        println("CP ${dto.chargePointId}, Connector ${dto.connectorId} changeConnectorStatus")
    }

    override fun sendMeterValue(dto: ReevJsonDto) {
        println("CP ${dto.chargePointId}, Connector ${dto.connectorId} sendMeterValue")
    }

}