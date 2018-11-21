package teste.ifood.to

import teste.ifood.enums.ErrorEnum

class ResponseTO<T> : TransferObject
{
    var result: T? = null
    var errorEnum: ErrorEnum? = null

    constructor() {}

    constructor(result: T)
    {
        this.result = result
    }

    constructor(errorEnum: ErrorEnum)
    {
        this.errorEnum = errorEnum
    }

    constructor(result: T, errorEnum: ErrorEnum)
    {
        this.result = result
        this.errorEnum = errorEnum
    }
}
