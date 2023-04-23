(ns clojuredocs.page.vars
  (:require
    [clojuredocs.components.sidebar :refer [sidebar]]))


(def a
  {:added "1.0",
   :name 'map,
   :file "clojure/core.clj",
   :arglists "([f] [f coll] [f c1 c2] [f c1 c2 c3] [f c1 c2 c3 & colls])"
   :doc "Returns a lazy sequence consisting of the result of applying f to\n  the set of first items of each coll, followed by applying f to the\n  set of second items in each coll, until any one of the colls is\n  exhausted.  Any remaining items in other colls are ignored. Function\n  f should accept number-of-colls arguments. Returns a transducer when\n  no collection is provided."})


(defn example
  []
  [:div.my-6
   [:strong.is-size-4
    "Exemplos"]
   (map (fn [_]
          [:div.box
           [:strong "John Doe"]
           [:hr]
           [:pre "(map inc [1 2 3 4 5])"]]) (range 5))]) ; TODO: make a pretty view

(defn notes
  []
  [:div.my-6
   [:strong.is-size-4
    "Comentarios"]
   (map (fn [_]
          [:div.box
           [:strong "John Doe"]
           [:hr]
           [:pre "lorem ipsum"]]) (range 5))])


(defn var-page
  []
  [:div.container
   [:div.box.m-4.columns
    [sidebar]
    [:div.column.is-9
     [:div.box
      [:strong.title (:name a)]
      [:hr]
      [:div
       [:div
        [:strong.tag.is-info.is-light.mx-2 (:file a)]
        [:strong.tag.is-info.is-light.mx-2 (:arglists a)]
        [:strong.tag.is-info.is-light.mx-2 "adicionado em:" (:added a)]]
       [:hr]
       [:pre
        (:doc a)]
       [example]
       [:hr]
       [notes]]]]]])

