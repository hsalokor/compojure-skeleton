(ns skeleton.core
  (:gen-class)
  (:use [compojure.core])
  (:use [ring.adapter.jetty])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes my-routes
  (GET "/" [] "HELO")
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (handler/site my-routes))

(defn -main [& args]
  (run-jetty my-routes {:port 3000}))
