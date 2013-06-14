package edu.upenn.wharton.stash.plugin.hook;

import com.atlassian.stash.hook.*;
import com.atlassian.stash.hook.repository.*;
import com.atlassian.stash.repository.*;
import java.util.Collection;

public class RejectAllRepositoryHook implements PreReceiveRepositoryHook
{
    /**
     * Reject all pushes
     */
    @Override
    public boolean onReceive(RepositoryHookContext context, Collection<RefChange> refChanges, HookResponse hookResponse)
    {
       
      hookResponse.err().println("Pushing to this repository is not allowed!");
      return false;
            
    }
}
