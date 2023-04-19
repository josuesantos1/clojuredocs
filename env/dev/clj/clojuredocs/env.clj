(ns clojuredocs.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [clojuredocs.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojuredocs started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojuredocs has shut down successfully]=-"))
   :middleware wrap-dev})
