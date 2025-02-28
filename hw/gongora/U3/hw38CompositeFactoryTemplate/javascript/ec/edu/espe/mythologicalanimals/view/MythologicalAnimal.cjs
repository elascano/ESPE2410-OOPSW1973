const DragonBodyPartsFactory = require("../controller/DragonBodyPartsFactory.cjs")
const GriffinBodyPartsFactory = require("..//controller/GriffinBodyPartsFactory.cjs")
const {Griffin, Dragon } = require("../model/index.cjs") 

let griffinBodyPartsFactory = new GriffinBodyPartsFactory()

let head = griffinBodyPartsFactory.createHead();

let leg1 = griffinBodyPartsFactory.createLeg();
let leg2 = griffinBodyPartsFactory.createLeg();
let leg3 = griffinBodyPartsFactory.createLeg();
let leg4 = griffinBodyPartsFactory.createLeg();
let tail = griffinBodyPartsFactory.createTail();
let wing = griffinBodyPartsFactory.createWing();

let griffin = new Griffin();

griffin.add(head)
griffin.add(leg1)
griffin.add(leg2)
griffin.add(leg3)
griffin.add(leg4)
griffin.add(tail)
griffin.add(wing)

griffin.appear()

griffin.attack()

let dragonBodyPartsFactory = new DragonBodyPartsFactory()

head = dragonBodyPartsFactory.createHead();

leg1 = dragonBodyPartsFactory.createLeg();
leg2 = dragonBodyPartsFactory.createLeg();
leg3 = dragonBodyPartsFactory.createLeg();
leg4 = dragonBodyPartsFactory.createLeg();

tail = dragonBodyPartsFactory.createTail();

wing = dragonBodyPartsFactory.createWing();

let dragon = new Dragon();

dragon.add(head)
dragon.add(leg1)
dragon.add(leg2)
dragon.add(leg3)
dragon.add(leg4)
dragon.add(tail)
dragon.add(wing)

dragon.appear()

dragon.attack()