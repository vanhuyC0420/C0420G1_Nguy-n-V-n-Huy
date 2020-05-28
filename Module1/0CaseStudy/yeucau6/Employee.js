var Employee = function () {
    this.getName=function () {
        return this.name;
    }
    this.getBirthday=function () {
        return this.birthday;
    }
    this.getPhone=function () {
        return this.phone;
    }
    this.getIdcard=function () {
        return this.idcard;
    }
    this.getEmail=function () {
        return this.email;
    }
    this.getLevel=function () {
        return this.level;
    }
    this.getLocaltion=function () {
        return this.localtion;
    }
    this.getSalary=function () {
        if (this.getLocaltion()==="Manager"){
            this.salary=500;
        }else if (this.getLocaltion()==="Sale"){
            this.salary=300;
        }else if (this.getLocaltion()==="Maketting"){
            this.salary=200;
        }
        return this.salary;
    }
    this.setName=function (name) {
        this.name=name;
    }
    this.setBirthday=function (birthday) {
        this.birthday=birthday;
    }
    this.setPhone=function (phone) {
        this.phone=phone;
    }
    this.setEmail=function (email) {
        this.email=email;
    }
    this.setIdcard=function (idcard) {
        this.idcard=idcard;
    }
    this.setLevel=function (level) {
        this.level=level;
    }
    this.setLocaltion=function (localtion) {
        this.localtion=localtion;
    }

}