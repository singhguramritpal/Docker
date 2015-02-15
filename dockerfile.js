var MongoClient = require('mongodb').MongoClient;

// Connect to the db
MongoClient.connect("mongodb://Guramritpal:win123)(*&@ds043991.mongolab.com:43991/dockerfile", function(err, db) {
  if(err) { return console.dir(err); }

  var collection = db.collection('test');
  var doc = {mykey:1, fieldtoupdate:1};

  collection.insert(doc, {w:1}, function(err, result) {
    collection.update({mykey:1}, {$set:{fieldtoupdate:2}}, {w:1}, function(err, result) {});
  });

  var doc2 = {mykey:2, docs:[{doc1:1}]};

  collection.insert(doc2, {w:1}, function(err, result) {
    collection.update({mykey:2}, {$push:{docs:{doc2:1}}}, {w:1}, function(err, result) {});
  });
});