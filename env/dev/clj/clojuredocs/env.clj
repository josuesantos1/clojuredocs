(ns clojuredocs.env
  (:require
    [clojure.tools.logging :as log]
    [clojuredocs.dev-middleware :refer [wrap-dev]]
    [selmer.parser :as parser]))


(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojuredocs started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojuredocs has shut down successfully]=-"))
   :middleware wrap-dev})
