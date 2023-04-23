(ns clojuredocs.routes.home
  (:require
    [clojure.java.io :as io]
    [clojuredocs.layout :as layout]
    [clojuredocs.middleware :as middleware]
    [ring.util.http-response :as response]
    [ring.util.response]))


(defn home-page
  [request]
  (layout/render request "home.html"))


(defn home-routes
  []
  [""
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get home-page}]
   ["/docs" {:get (fn [_]
                    (-> (response/ok (-> "docs/docs.md" io/resource slurp))
                        (response/header "Content-Type" "text/plain; charset=utf-8")))}]])

