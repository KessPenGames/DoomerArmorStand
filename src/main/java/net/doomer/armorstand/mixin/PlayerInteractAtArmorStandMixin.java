package net.doomer.armorstand.mixin;

import net.doomer.armorstand.config.PosesList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.EulerAngle;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mixin(ArmorStandEntity.class)
public abstract class PlayerInteractAtArmorStandMixin extends Entity {
    private final Map<List<Integer>, Integer> armorPose = new HashMap<>();

    public PlayerInteractAtArmorStandMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Shadow public abstract void setHeadRotation(EulerAngle angle);

    @Shadow protected abstract void setShowArms(boolean showArms);

    @Shadow public abstract void setBodyRotation(EulerAngle angle);

    @Shadow public abstract void setLeftLegRotation(EulerAngle angle);

    @Shadow public abstract void setRightLegRotation(EulerAngle angle);

    @Shadow public abstract void setLeftArmRotation(EulerAngle angle);

    @Shadow public abstract void setRightArmRotation(EulerAngle angle);

    @Inject(at = @At(value = "HEAD"), method = "interactAt", cancellable = true)
    private void onEntityInteract(PlayerEntity player, Vec3d hitPos, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
        if (this.isInvisible()) return;
        if (player.isSneaking() && hand == Hand.MAIN_HAND) {
            Map<String, Map<String, List<Integer>>> posesList = new PosesList().getPosesList();
            List<Integer> position = new ArrayList<>();
            position.add(this.getBlockX());
            position.add(this.getBlockY());
            position.add(this.getBlockZ());
            if (armorPose.containsKey(position)) {
                int pose = armorPose.get(position);
                armorPose.remove(position);

                if (isLastPose(posesList, pose)) {
                    armorPose.put(position, 1);
                } else {
                    armorPose.put(position, pose + 1);
                }

                Map<String, List<Integer>> paramList = posesList.get(pose + "");

                List<Integer> bodyPose = paramList.get("bodyPose");
                List<Integer> headPose = paramList.get("headPose");
                List<Integer> leftLegPose = paramList.get("leftLegPose");
                List<Integer> rightLegPose = paramList.get("rightLegPose");
                List<Integer> leftArmPose = paramList.get("leftArmPose");
                List<Integer> rightArmPose = paramList.get("rightArmPose");

                this.setShowArms(true);
                this.setBodyRotation(new EulerAngle(bodyPose.get(0),bodyPose.get(1),bodyPose.get(2)));
                this.setHeadRotation(new EulerAngle(headPose.get(0),headPose.get(1),headPose.get(2)));
                this.setLeftLegRotation(new EulerAngle(leftLegPose.get(0),leftLegPose.get(1),leftLegPose.get(2)));
                this.setRightLegRotation(new EulerAngle(rightLegPose.get(0),rightLegPose.get(1),rightLegPose.get(2)));
                this.setLeftArmRotation(new EulerAngle(leftArmPose.get(0),leftArmPose.get(1),leftArmPose.get(2)));
                this.setRightArmRotation(new EulerAngle(rightArmPose.get(0),rightArmPose.get(1),rightArmPose.get(2)));
            } else {
                Map<String, List<Integer>> paramList = posesList.get("1");
                armorPose.put(position, 2);

                List<Integer> bodyPose = paramList.get("bodyPose");
                List<Integer> headPose = paramList.get("headPose");
                List<Integer> leftLegPose = paramList.get("leftLegPose");
                List<Integer> rightLegPose = paramList.get("rightLegPose");
                List<Integer> leftArmPose = paramList.get("leftArmPose");
                List<Integer> rightArmPose = paramList.get("rightArmPose");

                this.setShowArms(true);
                this.setBodyRotation(new EulerAngle((float)(double)bodyPose.get(0),(float)(double)bodyPose.get(1),(float)(double)bodyPose.get(2)));
                this.setHeadRotation(new EulerAngle((float)(double)headPose.get(0),(float)(double)headPose.get(1),(float)(double)headPose.get(2)));
                this.setLeftLegRotation(new EulerAngle((float)(double)leftLegPose.get(0),(float)(double)leftLegPose.get(1),(float)(double)leftLegPose.get(2)));
                this.setRightLegRotation(new EulerAngle((float)(double)rightLegPose.get(0),(float)(double)rightLegPose.get(1),(float)(double)rightLegPose.get(2)));
                this.setLeftArmRotation(new EulerAngle((float)(double)leftArmPose.get(0),(float)(double)leftArmPose.get(1),(float)(double)leftArmPose.get(2)));
                this.setRightArmRotation(new EulerAngle((float)(double)rightArmPose.get(0),(float)(double)rightArmPose.get(1),(float)(double)rightArmPose.get(2)));
            }

            cir.setReturnValue(ActionResult.FAIL);
        }
    }

    private boolean isLastPose(Map<String, Map<String, List<Integer>>> posesList, int pose) {
        pose = pose + 1;
        return posesList.get(pose + "") == null;
    }
}