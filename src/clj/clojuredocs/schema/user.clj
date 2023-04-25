(ns clojuredocs.schema.user)


(def user
  [{:db/ident       :user/id
    :db/valueType   :db.type/uuid
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity}
   {:db/ident       :user/name
    :db/valueType   :db.type/ref
    :db/cardinality :db.cardinality/one}
   {:db/ident       :user/token
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/doc         "token from gitlab or github"}
   {:db/ident       :user/nickname
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/doc         "nickname from gitlab or github"}])
