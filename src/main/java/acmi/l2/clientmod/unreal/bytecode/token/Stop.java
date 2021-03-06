package acmi.l2.clientmod.unreal.bytecode.token;

import acmi.l2.clientmod.unreal.UnrealRuntimeContext;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
public class Stop extends Token {
    public static final int OPCODE = 0x08;

    @Override
    protected int getOpcode() {
        return OPCODE;
    }

    @Override
    public String toString() {
        return "Stop()";
    }

    @Override
    public String toString(UnrealRuntimeContext context) {
        return "";
    }
}
