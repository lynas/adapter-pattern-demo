package com.reev.adapterpattern


fun main(args: Array<String>) {
    val ocpp16CpAdapter = Ocpp16AdapterReevBackendADAPTER(Ocpp16())
    val ocpp20CpAdapter = Ocpp20ReevBackendADAPTER(Ocpp20())

    ocpp20CpAdapter.changeConnectorStatus(ReevJsonDto())
    ocpp20CpAdapter.authorize(ReevJsonDto())
    ocpp20CpAdapter.startTransaction(ReevJsonDto())
    ocpp20CpAdapter.sendMeterValue(ReevJsonDto())
    ocpp20CpAdapter.stopTransaction(ReevJsonDto())
    ocpp20CpAdapter.changeConnectorStatus(ReevJsonDto())

    println("\n\n")
    println("\n\n")


    ocpp16CpAdapter.changeConnectorStatus(ReevJsonDto())
    ocpp16CpAdapter.authorize(ReevJsonDto())
    ocpp16CpAdapter.startTransaction(ReevJsonDto())
    ocpp16CpAdapter.sendMeterValue(ReevJsonDto())
    ocpp16CpAdapter.stopTransaction(ReevJsonDto())
    ocpp16CpAdapter.changeConnectorStatus(ReevJsonDto())
}
