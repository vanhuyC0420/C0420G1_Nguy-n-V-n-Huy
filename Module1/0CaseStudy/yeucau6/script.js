let Customer = function(){
    this.setName=function (name) {
        this.name=name;
    }
    this.getName=function () {
        return this.name;
    }
    this.setIdcard=function (idCard) {
        this.idCard=idCard;
    }
    this.getIdcard=function () {
        return this.idCard;
    }
    this.setPhoneNumber=function (phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    this.getPhoneNumber=function () {
        return this.phoneNumber;
    }
    this.setEmail=function (email) {
        this.email=email;
    }
    this.getEmail=function () {
        return this.email;
    }
    this.setAddress=function (address) {
        this.address=address;
    }
    this.getAddress=function () {
        return this.address;
    }
    this.setGender=function (gender) {
        this.gender=gender;
    }
    this.getGender=function () {
        return this.gender
    }
    this.setBirthday=function (birthday) {
        this.birthday=birthday;
    }
    this.getBirthday=function () {
        return this.birthday;
    }
    this.setTypeCustomer=function(typeCustomer) {
        this.typeCustomer=typeCustomer;
    }
    this.getTypeCustomer=function(typeCustomer){
        this.typeCustomer=typeCustomer
    }
    this.setDiscount=function (discount) {
        this.discount=discount;
    }
    this.getDiscount=function () {
        return this.discount;
    }
    this.setRentdays=function (rentDays) {
        this.rentDays = rentDays;
    }
    this.getRentDays=function () {
        return this.rentDays;
    }
    this.setTyperServer=function (typerServer) {
        this.typerService=typerServer;
    }
    this.getTyperServer=function () {
        return this.typerService;
    }
    this.setTypeRoom=function (typeRoom) {
        this.typeRoom=typeRoom;
    }
    this.getTypeRoom=function () {
        return this.typeRoom;
    }
    this.setQuantityIncluded=function (quantityInclud) {
        this.quantityIncluded=quantityInclud;
    }
    this.getQuantityIncluded=function () {
        return this.quantityIncluded;
    }
    this.totalPays = function () {
        let money = 0;
        if(this.typerService==="Villa"){
            money = 500;
        }else if (this.typerService==="House"){
            money=300;
        }else if(this.typerService==="Room"){
            money=200;
        }
        return this.getRentDays()*money*(1-this.getDiscount()/100);
    }
}
