
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
|image|text|null: false|
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
