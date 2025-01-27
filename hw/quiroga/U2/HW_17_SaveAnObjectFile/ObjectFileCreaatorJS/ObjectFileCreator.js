const protobuf = require("protobufjs");


protobuf.load("schema.proto", (err, root) => {
  if (err) throw err;

  const Persona = root.lookupType("Persona");

  const message = Persona.create({
    nombre: "Juan",
    edad: 30,
    activo: true,
  });

  const buffer = Persona.encode(message).finish();


  require('fs').writeFileSync("archivo_binario.dat", buffer);
  console.log("Archivo guardado en binario.");
});
