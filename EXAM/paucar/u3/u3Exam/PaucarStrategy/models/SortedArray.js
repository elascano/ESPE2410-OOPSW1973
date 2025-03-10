const mongoose = require('mongoose');

const sortedArraySchema = new mongoose.Schema({
    unsorted: String,
    size: Number,
    "sort algorithm": String,
    sorted: String
}, { collection: 'PaucarSortedArray' }); 

module.exports = mongoose.model('SortedArray', sortedArraySchema);
