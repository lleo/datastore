
(set-env!
 :source-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.7.0"]
                 ]
 )

(task-options!
 aot {:namespace '#{datastore.core}}
 pom {:project 'datastore
      :version "0.1.0"}
 jar {:main 'datastore.core})

(deftask build
  "Builds an uberjar of this project that can be run with java -jar"
  []
  (comp (aot) (pom) (uber) (jar) ))
