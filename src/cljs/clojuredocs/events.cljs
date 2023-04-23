(ns clojuredocs.events
  (:require
    [ajax.core :as ajax]
    [re-frame.core :as rf]
    [reitit.frontend.controllers :as rfc]
    [reitit.frontend.easy :as rfe]))


;; dispatchers

(rf/reg-event-db
  :common/navigate
  (fn [db [_ match]]
    (let [old-match (:common/route db)
          new-match (assoc match :controllers
                           (rfc/apply-controllers (:controllers old-match) match))]
      (assoc db :common/route new-match))))


(rf/reg-fx
  :common/navigate-fx!
  (fn [[k & [params query]]]
    (rfe/push-state k params query)))


(rf/reg-event-fx
  :common/navigate!
  (fn [_ [_ url-key params query]]
    {:common/navigate-fx! [url-key params query]}))


(rf/reg-event-db
  :set-docs
  (fn [db [_ docs]]
    (assoc db :docs docs)))


(rf/reg-event-fx
  :fetch-docs
  (fn [_ _]
    {:http-xhrio {:method          :get
                  :uri             "/docs"
                  :response-format (ajax/raw-response-format)
                  :on-success       [:set-docs]}}))


(rf/reg-event-db
  :common/set-error
  (fn [db [_ error]]
    (assoc db :common/error error)))


(rf/reg-event-fx
  :page/init-home
  (fn [_ _]
    {:dispatch [:fetch-docs]}))


;; subscriptions

(rf/reg-sub
  :common/route
  (fn [db _]
    (-> db :common/route)))


(rf/reg-sub
  :common/page-id
  :<- [:common/route]
  (fn [route _]
    (-> route :data :name)))


(rf/reg-sub
  :common/page
  :<- [:common/route]
  (fn [route _]
    (-> route :data :view)))


(rf/reg-sub
  :docs
  (fn [db _]
    (:docs db)))


(rf/reg-sub
  :common/error
  (fn [db _]
    (:common/error db)))


(rf/reg-sub
  :var/content
  (fn [db _]
    {:added "1.0",
     :name 'map,
     :file "clojure/core.clj",
     :arglists "([f] [f coll] [f c1 c2] [f c1 c2 c3] [f c1 c2 c3 & colls])"
     :doc "Returns a lazy sequence consisting of the result of applying f to\n  the set of first items of each coll, followed by applying f to the\n  set of second items in each coll, until any one of the colls is\n  exhausted.  Any remaining items in other colls are ignored. Function\n  f should accept number-of-colls arguments. Returns a transducer when\n  no collection is provided."
     :comment [{:name "john doe"
                :content "comment"
                :id 1}
               {:name "john doe"
                :content "comment"
                :id 2}]
     :example [{:name "john doe"
                :content "(map inc [1 2 3 4 5])"
                :id 1}
               {:name "john doe"
                :content "(map inc [1 2 3 4 5])"
                :id 2}]}))
