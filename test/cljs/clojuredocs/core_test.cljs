(ns clojuredocs.core-test
  (:require
    [cljs.test :refer-macros [is are deftest testing use-fixtures]]
    [clojuredocs.core :as rc]
    [pjstadig.humane-test-output]
    [reagent.core :as reagent :refer [atom]]))


(deftest test-home
  (is (= true true)))

