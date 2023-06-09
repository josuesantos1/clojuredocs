(ns ^:dev/once clojuredocs.app
  (:require
   [cljs.spec.alpha :as s]
   [clojuredocs.core :as core]
   [devtools.core :as devtools]
   [expound.alpha :as expound]))

(extend-protocol IPrintWithWriter
  js/Symbol
  (-pr-writer [sym writer _]
    (-write writer (str "\"" (.toString sym) "\""))))

(set! s/*explain-out* expound/printer)

(enable-console-print!)

(devtools/install!)

(core/init!)
