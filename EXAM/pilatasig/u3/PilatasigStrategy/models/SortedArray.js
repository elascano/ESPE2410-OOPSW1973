const mongoose = require('mongoose');

const sortedArraySchema = new mongoose.Schema({
    unsorted: String,
    size: Number,
    sortAlgorithm: String,
    sorted: String
}, { collection: 'PilatasigSortedArray'}); 

module.exports = mongoose.model('SortedArray', sortedArraySchema);
