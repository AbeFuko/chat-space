# README

This README would normally document whatever steps are necessary to get the
application up and running.

Things you may want to cover:

* Ruby version

* System dependencies

* Configuration

* Database creation

* Database initialization

* How to run the test suite

* Services (job queues, cache servers, search engines, etc.)

* Deployment instructions

* ...



## usersTable
|Column|Type|Options|
|------|----|-------|
|name|string|index: true, null: false, unique: true|
|email|string|index: true, null: false, unique: true|

### association
- has_many :groups, through: :user_groups
- has_many :messages
- has_many :images

## messagesTable
|Column|Type|Options|
|------|----|-------|
|message|text|null: false|
|user_id|integer|null: false, foreign_key: true|
|group_id|integer|null: false, foreign_key: true|

### association
- belongs_to :user
- belongs_to :group

## imageTable
|Column|Type|Options|
|------|----|-------|
|image|image|null: false|
|user_id|integer|null: false, foreign_key: true|
|group_id|integer|null: false, foreign_key: true|

### association
- belongs_to :user
- belongs_to :group

## groupsTable
|Column|Type|Options|
|------|----|-------|
|groupName|string|null: false|
|user_id|integer|null: false, foreign_key: true|

### association
- has_many :users, through: :user_groups
- has_many :messages
- has_many :images

## user_ groupsTable
|Column|Type|Option|
|------|----|------|
|user_id|integer|null: false|
|group_id|integer|null: false|

### association
- belongs_to :user
- belongs_to :group
