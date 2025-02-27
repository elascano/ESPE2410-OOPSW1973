class FamilyView {
  static renderFamilies(families) {
    const familyList = document.getElementById("familyList");
    familyList.innerHTML = "<h2>Familias:</h2>"; 

    families.forEach((family) => {
      const div = document.createElement("div");
      div.classList.add("family-card");
      div.innerHTML = `
        <p><strong>Apellido:</strong> ${family.lastName}</p>
        <p><strong>Miembros:</strong> ${family.members}</p>
        <p><strong>País:</strong> ${family.country}</p>
        <p><strong>Mascotas:</strong> ${family.pets ? "Sí" : "No"}</p>
      `;
      familyList.appendChild(div);
    });
  }

  static bindFormSubmit(callback) {
    const form = document.getElementById("familyForm");
    form.addEventListener("submit", async (e) => {
      e.preventDefault();

      const lastName = document.getElementById("lastName").value;
      const members = parseInt(document.getElementById("members").value, 10);
      const country = document.getElementById("country").value;
      const pets = document.getElementById("pets").checked;

      const family = { lastName, members, country, pets };
      await callback(family); 
      form.reset();
    });
  }
}