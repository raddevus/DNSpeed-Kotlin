package app.actionmobile.dnspeed

class Entry {
    public var title : String
    public var id : Int
    init {
        this.title = "";
        this.id = 0;
    }
    constructor(id: Int, title : String){
        this.id = id
        this.title = title
    }

}