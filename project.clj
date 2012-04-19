(defproject compojure-skeleton "0.2-SNAPSHOT"
  :description "Compojure skeleton"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.0.1"]
                 [ring/ring "1.0.2"]
                 [ring/ring-core "1.0.2"]
                 [ring/ring-jetty-adapter "1.0.2"]]
  :plugins [[lein-ring "0.6.1"]
            [lein-midje "1.0.9"]]
  :dev-dependencies [[ring/ring-devel "1.0.2"]
                     [midje "1.3.1"]]
  :ring {:handler skeleton.core/app}
  :aot [skeleton.core]
  :main skeleton.core)
