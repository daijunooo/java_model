# java 领域建模开发实践
- 基本实现领域建模的方式开发，当然实现的好与不好另说
- 所有的业务应该被分解成一个个模型，比如商品，分类，订单等等
- 不同的业务对应着不同的模型操作，不同模型操作的组合实现完整业务逻辑
- 比如下单，商品模型减库存，订单模型新建订单，地址模型记录收货地址

# 说明
- 为了区分是模型中的方法，也为了避免与实体类中的方法重名所有模型方法都加了 $ 前缀
- 所有业务相关的模型的代码都应该写在com/oop/oop/model下，Service中只是对模型的操作进行组织和支配
- 模型的复用度极高，除了在业务代码中，其他场景下，拿到模型一样可以操作，比如消费队列中或异步任务

# 改变了什么
- 转变了开发者的角色，从一个流水线工人转变为一个指挥者
- 排查问题更容易，一个个模型就像一个个车间，哪里出问题很容易找到
- 代码的组织更有逻辑性，每个模型只干每个模型的事
