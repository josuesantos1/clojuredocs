(ns clojuredocs.page.vars
  (:require
    [re-frame.core :as rf] 
    [clojuredocs.components.sidebar :refer [sidebar]]))

(defn example
  [data]
  [:div.my-6
   [:strong.is-size-4
    "Exemplos"]
   (map (fn [example]
          [:div.box {:key (:id example)}
           [:strong (:name example)]
           [:hr]
           [:pre (:content example)]]) data)]) ; TODO: make a pretty view

(defn notes
  [data]
  [:div.my-6
   [:strong.is-size-4
    "Comentarios"]
   (map (fn [comment*]
          [:div.box {:key (:id comment*)}
           [:strong (:name comment*)]
           [:hr]
           [:pre "lorem ipsum"]]) data)])


(defn var-page
  []
  (let [content @(rf/subscribe [:var/content])]
    (println content)
    [:div.container
     [:div.box.m-4.columns
      [sidebar]
      [:div.column.is-9
       [:div.box
        [:strong.title (:name content)]
        [:hr]
        [:div
         [:div
          [:strong.tag.is-info.is-light.mx-2 (:file content)]
          [:strong.tag.is-info.is-light.mx-2 (:arglists content)]
          [:strong.tag.is-info.is-light.mx-2 "adicionado em:" (:added content)]]
         [:hr]
         [:pre
          (:doc content)]
         [example (:example content)]
         [:hr]
         [notes (:comment content)]]]]]]))

