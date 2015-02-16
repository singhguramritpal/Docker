var MongoClient = require('mongodb').MongoClient;

// Connect to the db
MongoClient.connect("mongodb://Guramritpal:win123)(*&@ds043991.mongolab.com:43991/dockerfile", function(err, db) {
  if(err) { return console.dir(err); }

  var collection = db.collection('Amrit');
  var doc = {name:Amrit, course:SE};

  collection.insert(doc, {w:1}, function(err, result) {
    collection.update({name:Amrit}, {$set:{fieldtoupdate:2}}, {name:Amrit}, function(err, result) {});
  });

  var doc2 = {name:Amritpal, docs:[{doc1:1}]};

  collection.insert(doc2, {name:Amrit}, function(err, result) {
    collection.update({name:Amritpal}, {$push:{docs:{doc2:1}}}, {name:Amrit}, function(err, result) {});
  });
});
