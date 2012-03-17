(ns skeleton.core
  (:use [compojure.core])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes main-routes
  (GET "/" [] "HELO")
  (route/not-found "Page not found"))

(def app
  (handler/site main-routes))

