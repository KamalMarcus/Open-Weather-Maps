package com.ahmedismail.app.domain

import com.ahmedismail.app.domain.database.DatabaseGateway
import com.ahmedismail.app.domain.server.ServerGateway

data class Domain(val serverGateway: ServerGateway, val database: DatabaseGateway)