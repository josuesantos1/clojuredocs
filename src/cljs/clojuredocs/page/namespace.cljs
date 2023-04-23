(ns clojuredocs.page.namespace
  (:require
    [clojuredocs.components.sidebar :refer [sidebar]]
    [re-frame.core :as rf]))


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
        [:strong.title (:namespace content)]
        [:hr]
        [:div.box
         [:p.subtitle.is-5
          (:doc content)]
         [:pre (:description content)]]
        [:div
         [:strong "Vars in clojure.core"]
         [:hr]
         [vars (:vars content)]]]]]]))

