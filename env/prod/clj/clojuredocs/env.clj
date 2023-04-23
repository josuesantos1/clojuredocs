(ns clojuredocs.env
  (:require
    [clojure.tools.logging :as log]))


(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojuredocs started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojuredocs has shut down successfully]=-"))
   :middleware identity})
