(ns friend-api.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [cheshire.core :refer :all]))

(defroutes app-routes
  (GET "/" []
    (generate-string {:name "Big Teddy" :desc "Big and fluffy"}))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

(defn list-of-friends [])
