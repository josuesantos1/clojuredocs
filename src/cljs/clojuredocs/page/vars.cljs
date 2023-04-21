(ns clojuredocs.page.vars)


(def a
  {:added "1.0",
   :name 'map,
   :file "clojure/core.clj",
   :arglists "([f] [f coll] [f c1 c2] [f c1 c2 c3] [f c1 c2 c3 & colls])"
   :doc "Returns a lazy sequence consisting of the result of applying f to\n  the set of first items of each coll, followed by applying f to the\n  set of second items in each coll, until any one of the colls is\n  exhausted.  Any remaining items in other colls are ignored. Function\n  f should accept number-of-colls arguments. Returns a transducer when\n  no collection is provided."})

(defn sidebar
  []
  [:aside.menu.box.column.is-3
   [:div
    [:h5.menu-label "Namespaces"]
    [:hr]
    [:ul.menu-list
     [:li
      [:strong.menu-label "clojure"]
      [:ul.menu-list
       [:li
        [:span [:a {:href "/clojure.core"} "core"]]
        [:ul.menu-list
         [:li [:span [:a {:href "/clojure.core.async"} "async"]]]
         [:li
          [:span [:a {:href "/clojure.core.logic"} "logic"]]
          [:ul.menu-list
           [:li [:span [:a {:href "/clojure.core.logic.fd"} "fd"]]]
           [:li [:span [:a {:href "/clojure.core.logic.pldb"} "pldb"]]]]]
         [:li [:span [:a {:href "/clojure.core.protocols"} "protocols"]]]
         [:li [:span [:a {:href "/clojure.core.reducers"} "reducers"]]]
         [:li [:span [:a {:href "/clojure.core.server"} "server"]]]]]
       [:li [:span [:a {:href "/clojure.data"} "data"]]]
       [:li [:span [:a {:href "/clojure.datafy"} "datafy"]]]
       [:li [:span [:a {:href "/clojure.edn"} "edn"]]]
       [:li [:span [:a {:href "/clojure.inspector"} "inspector"]]]
       [:li [:span [:a {:href "/clojure.instant"} "instant"]]]
       [:li
        [:strong.menu-label "java"]
        [:ul.menu-list
         [:li [:span [:a {:href "/clojure.java.browse"} "browse"]]]
         [:li [:span [:a {:href "/clojure.java.io"} "io"]]]
         [:li [:span [:a {:href "/clojure.java.javadoc"} "javadoc"]]]
         [:li [:span [:a {:href "/clojure.java.shell"} "shell"]]]]]
       [:li [:span [:a {:href "/clojure.main"} "main"]]]
       [:li [:span [:a {:href "/clojure.pprint"} "pprint"]]]
       [:li [:span [:a {:href "/clojure.reflect"} "reflect"]]]
       [:li [:span [:a {:href "/clojure.repl"} "repl"]]]
       [:li [:span [:a {:href "/clojure.set"} "set"]]]
       [:li
        [:strong.menu-label "spec"]
        [:ul.menu-list [:li [:span [:a {:href "/clojure.spec.alpha"} "alpha"]]]]]
       [:li [:span [:a {:href "/clojure.stacktrace"} "stacktrace"]]]
       [:li [:span [:a {:href "/clojure.string"} "string"]]]
       [:li [:span [:a {:href "/clojure.template"} "template"]]]
       [:li
        [:span [:a {:href "/clojure.test"} "test"]]
        [:ul.menu-list
         [:li [:span [:a {:href "/clojure.test.junit"} "junit"]]]
         [:li [:span [:a {:href "/clojure.test.tap"} "tap"]]]]]
       [:li [:span [:a {:href "/clojure.walk"} "walk"]]]
       [:li [:span [:a {:href "/clojure.xml"} "xml"]]]
       [:li [:span [:a {:href "/clojure.zip"} "zip"]]]]]]]])


(defn example
  []
  [:div.my-6
   [:strong.is-size-4
    "Exemplos"]
   (map (fn [_]
          [:div.box
           [:strong "John Doe"]
           [:hr]
           [:pre "(map inc [1 2 3 4 5])"]]) (range 5))]) ;; TODO: make a pretty view

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


(defn meta-page
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
        [:strong.tag.is-info.is-light.mx-2 (:added a)]]
       [:hr]
       [:pre
        (:doc a)]
       [example]
       [:hr]
       [notes]]]]]])

