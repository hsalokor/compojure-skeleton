(defproject compojure-skeleton "0.2-SNAPSHOT"
  :description "Compojure skeleton"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.0.1"]]
  :plugins [[lein-ring "0.6.1"]]
  :ring {:handler skeleton.core/app})
