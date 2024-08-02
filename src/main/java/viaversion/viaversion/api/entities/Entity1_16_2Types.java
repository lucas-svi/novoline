package viaversion.viaversion.api.entities;

import viaversion.viaversion.api.Via;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Entity1_16_2Types {

    public static EntityType getTypeFromId(int typeID) {
        Optional<EntityType> type = EntityType.findById(typeID);
        if (!type.isPresent()) {
            Via.getPlatform().getLogger().severe("Could not find 1.16.2 type id " + typeID);
            return EntityType.ENTITY; // Fall back to the basic ENTITY
        }
        return type.get();
    }

    public enum EntityType implements viaversion.viaversion.api.entities.EntityType {
        ENTITY(-1),

        AREA_EFFECT_CLOUD(0, ENTITY),
        END_CRYSTAL(18, ENTITY),
        EVOKER_FANGS(23, ENTITY),
        EXPERIENCE_ORB(24, ENTITY),
        EYE_OF_ENDER(25, ENTITY),
        FALLING_BLOCK(26, ENTITY),
        FIREWORK_ROCKET(27, ENTITY),
        ITEM(37, ENTITY),
        LLAMA_SPIT(43, ENTITY),
        TNT(64, ENTITY),
        SHULKER_BULLET(71, ENTITY),
        FISHING_BOBBER(107, ENTITY),

        LIVINGENTITY(-1, ENTITY),
        ARMOR_STAND(1, LIVINGENTITY),
        PLAYER(106, LIVINGENTITY),

        ABSTRACT_INSENTIENT(-1, LIVINGENTITY),
        ENDER_DRAGON(19, ABSTRACT_INSENTIENT),

        BEE(4, ABSTRACT_INSENTIENT),

        ABSTRACT_CREATURE(-1, ABSTRACT_INSENTIENT),

        ABSTRACT_AGEABLE(-1, ABSTRACT_CREATURE),
        VILLAGER(93, ABSTRACT_AGEABLE),
        WANDERING_TRADER(95, ABSTRACT_AGEABLE),

        // Animals
        ABSTRACT_ANIMAL(-1, ABSTRACT_AGEABLE),
        DOLPHIN(13, ABSTRACT_INSENTIENT),
        CHICKEN(9, ABSTRACT_ANIMAL),
        COW(11, ABSTRACT_ANIMAL),
        MOOSHROOM(53, COW),
        PANDA(56, ABSTRACT_INSENTIENT),
        PIG(59, ABSTRACT_ANIMAL),
        POLAR_BEAR(63, ABSTRACT_ANIMAL),
        RABBIT(66, ABSTRACT_ANIMAL),
        SHEEP(69, ABSTRACT_ANIMAL),
        TURTLE(91, ABSTRACT_ANIMAL),
        FOX(28, ABSTRACT_ANIMAL),

        ABSTRACT_TAMEABLE_ANIMAL(-1, ABSTRACT_ANIMAL),
        CAT(7, ABSTRACT_TAMEABLE_ANIMAL),
        OCELOT(54, ABSTRACT_TAMEABLE_ANIMAL),
        WOLF(100, ABSTRACT_TAMEABLE_ANIMAL),

        ABSTRACT_PARROT(-1, ABSTRACT_TAMEABLE_ANIMAL),
        PARROT(57, ABSTRACT_PARROT),

        // Horses
        ABSTRACT_HORSE(-1, ABSTRACT_ANIMAL),
        CHESTED_HORSE(-1, ABSTRACT_HORSE),
        DONKEY(14, CHESTED_HORSE),
        MULE(52, CHESTED_HORSE),
        LLAMA(42, CHESTED_HORSE),
        TRADER_LLAMA(89, CHESTED_HORSE),
        HORSE(33, ABSTRACT_HORSE),
        SKELETON_HORSE(74, ABSTRACT_HORSE),
        ZOMBIE_HORSE(103, ABSTRACT_HORSE),

        // Golem
        ABSTRACT_GOLEM(-1, ABSTRACT_CREATURE),
        SNOW_GOLEM(77, ABSTRACT_GOLEM),
        IRON_GOLEM(36, ABSTRACT_GOLEM),
        SHULKER(70, ABSTRACT_GOLEM),

        // Fish
        ABSTRACT_FISHES(-1, ABSTRACT_CREATURE),
        COD(10, ABSTRACT_FISHES),
        PUFFERFISH(65, ABSTRACT_FISHES),
        SALMON(68, ABSTRACT_FISHES),
        TROPICAL_FISH(90, ABSTRACT_FISHES),

        // Monsters
        ABSTRACT_MONSTER(-1, ABSTRACT_CREATURE),
        BLAZE(5, ABSTRACT_MONSTER),
        CREEPER(12, ABSTRACT_MONSTER),
        ENDERMITE(21, ABSTRACT_MONSTER),
        ENDERMAN(20, ABSTRACT_MONSTER),
        GIANT(30, ABSTRACT_MONSTER),
        SILVERFISH(72, ABSTRACT_MONSTER),
        VEX(92, ABSTRACT_MONSTER),
        WITCH(96, ABSTRACT_MONSTER),
        WITHER(97, ABSTRACT_MONSTER),
        RAVAGER(67, ABSTRACT_MONSTER),

        ABSTRACT_PIGLIN(-1, ABSTRACT_MONSTER),

        PIGLIN(60, ABSTRACT_PIGLIN),
        PIGLIN_BRUTE(61, ABSTRACT_PIGLIN),

        HOGLIN(32, ABSTRACT_ANIMAL),
        STRIDER(83, ABSTRACT_ANIMAL),
        ZOGLIN(101, ABSTRACT_MONSTER),

        // Illagers
        ABSTRACT_ILLAGER_BASE(-1, ABSTRACT_MONSTER),
        ABSTRACT_EVO_ILLU_ILLAGER(-1, ABSTRACT_ILLAGER_BASE),
        EVOKER(22, ABSTRACT_EVO_ILLU_ILLAGER),
        ILLUSIONER(35, ABSTRACT_EVO_ILLU_ILLAGER),
        VINDICATOR(94, ABSTRACT_ILLAGER_BASE),
        PILLAGER(62, ABSTRACT_ILLAGER_BASE),

        // Skeletons
        ABSTRACT_SKELETON(-1, ABSTRACT_MONSTER),
        SKELETON(73, ABSTRACT_SKELETON),
        STRAY(82, ABSTRACT_SKELETON),
        WITHER_SKELETON(98, ABSTRACT_SKELETON),

        // Guardians
        GUARDIAN(31, ABSTRACT_MONSTER),
        ELDER_GUARDIAN(17, GUARDIAN),

        // Spiders
        SPIDER(80, ABSTRACT_MONSTER),
        CAVE_SPIDER(8, SPIDER),

        // Zombies
        ZOMBIE(102, ABSTRACT_MONSTER),
        DROWNED(16, ZOMBIE),
        HUSK(34, ZOMBIE),
        ZOMBIFIED_PIGLIN(105, ZOMBIE),
        ZOMBIE_VILLAGER(104, ZOMBIE),

        // Flying entities
        ABSTRACT_FLYING(-1, ABSTRACT_INSENTIENT),
        GHAST(29, ABSTRACT_FLYING),
        PHANTOM(58, ABSTRACT_FLYING),

        ABSTRACT_AMBIENT(-1, ABSTRACT_INSENTIENT),
        BAT(3, ABSTRACT_AMBIENT),

        ABSTRACT_WATERMOB(-1, ABSTRACT_INSENTIENT),
        SQUID(81, ABSTRACT_WATERMOB),

        // Slimes
        SLIME(75, ABSTRACT_INSENTIENT),
        MAGMA_CUBE(44, SLIME),

        // Hangable objects
        ABSTRACT_HANGING(-1, ENTITY),
        LEASH_KNOT(40, ABSTRACT_HANGING),
        ITEM_FRAME(38, ABSTRACT_HANGING),
        PAINTING(55, ABSTRACT_HANGING),

        ABSTRACT_LIGHTNING(-1, ENTITY),
        LIGHTNING_BOLT(41, ABSTRACT_LIGHTNING),

        // Arrows
        ABSTRACT_ARROW(-1, ENTITY),
        ARROW(2, ABSTRACT_ARROW),
        SPECTRAL_ARROW(79, ABSTRACT_ARROW),
        TRIDENT(88, ABSTRACT_ARROW),

        // Fireballs
        ABSTRACT_FIREBALL(-1, ENTITY),
        DRAGON_FIREBALL(15, ABSTRACT_FIREBALL),
        FIREBALL(39, ABSTRACT_FIREBALL),
        SMALL_FIREBALL(76, ABSTRACT_FIREBALL),
        WITHER_SKULL(99, ABSTRACT_FIREBALL),

        // Projectiles
        PROJECTILE_ABSTRACT(-1, ENTITY),
        SNOWBALL(78, PROJECTILE_ABSTRACT),
        ENDER_PEARL(85, PROJECTILE_ABSTRACT),
        EGG(84, PROJECTILE_ABSTRACT),
        POTION(87, PROJECTILE_ABSTRACT),
        EXPERIENCE_BOTTLE(86, PROJECTILE_ABSTRACT),

        // Vehicles
        MINECART_ABSTRACT(-1, ENTITY),
        CHESTED_MINECART_ABSTRACT(-1, MINECART_ABSTRACT),
        CHEST_MINECART(46, CHESTED_MINECART_ABSTRACT),
        HOPPER_MINECART(49, CHESTED_MINECART_ABSTRACT),
        MINECART(45, MINECART_ABSTRACT),
        FURNACE_MINECART(48, MINECART_ABSTRACT),
        COMMAND_BLOCK_MINECART(47, MINECART_ABSTRACT),
        TNT_MINECART(51, MINECART_ABSTRACT),
        SPAWNER_MINECART(50, MINECART_ABSTRACT),
        BOAT(6, ENTITY);

        private static final Map<Integer, EntityType> TYPES = new HashMap<>();

        private final int id;
        private final EntityType parent;

        EntityType(int id) {
            this.id = id;
            this.parent = null;
        }

        EntityType(int id, EntityType parent) {
            this.id = id;
            this.parent = parent;
        }

        @Override
        public int getId() {
            return id;
        }

        @Override
        public EntityType getParent() {
            return parent;
        }

        static {
            for (EntityType type : EntityType.values()) {
                TYPES.put(type.id, type);
            }
        }

        public static Optional<EntityType> findById(int id) {
            if (id == -1)
                return Optional.empty();
            return Optional.ofNullable(TYPES.get(id));
        }
    }
}
