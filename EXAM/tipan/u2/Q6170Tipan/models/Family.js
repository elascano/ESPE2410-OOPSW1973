class Family {
  constructor(lastName, members, country, pets) {
    this.lastName = lastName;
    this.members = members;
    this.country = country;
    this.pets = pets;
  }

  
  validate() {
    if (!this.lastName || typeof this.lastName !== "string") {
      throw new Error("El apellido es obligatorio y debe ser una cadena.");
    }

    if (!Number.isInteger(this.members) || this.members < 1) {
      throw new Error("El número de miembros debe ser un número entero mayor a 0.");
    }

    if (!this.country || typeof this.country !== "string") {
      throw new Error("El país es obligatorio y debe ser una cadena.");
    }

    if (typeof this.pets !== "boolean") {
      throw new Error("Mascotas debe ser un valor booleano (true o false).");
    }
  }


  toObject() {
    return {
      lastName: this.lastName,
      members: this.members,
      country: this.country,
      pets: this.pets,
    };
  }
}

module.exports = Family;
  

