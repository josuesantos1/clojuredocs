(ns clojuredocs.page.namespace
  (:require
    [re-frame.core :as rf] 
    [clojuredocs.components.sidebar :refer [sidebar]]))

(defn vars
  [data]
  [:div
   (map (fn [vars*]
          [:div.box
           [:h1 (:title vars*)]
           [:hr]
           (map (fn [var*]
                  [:div.is-flex.columns.py-2
                   [:a.column.is-2 (:name var*)]
                   [:pre (:doc var*)]]) (:vars vars*))]) data)])

(defn namespace-page
  []
  (let [content @(rf/subscribe [:namespace/content])]
    [:div.container
     [:div.box.m-4.columns
      [sidebar]
      [:div.column.is-9
       [:div.box
        [:strong.title (:file content)]
        [:hr]
        [:div.box
         [:pre
          "Fundamental library of the Clojure language"]
         [:pre "The largest of the core namespaces, clojure.core provides the bulk of the functionality you'll be using to build Clojure programs.
There are too many core functions to feature here, but take a look at the quickref to get a breakdown by conceptual arena."]]
        [:div
         [:strong "Vars in clojure.core"]
         [:hr]
         [vars (:vars content)]]]]]]))

